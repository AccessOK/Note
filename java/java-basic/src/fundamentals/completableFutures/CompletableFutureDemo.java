import java.awt.image;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import javax.imageio.*;

public class CompletableFutureDemo{
    private static final Pattern IMG_PATTERN=Pattern.compile("[<]\\s*[iI][mM][gG]\\s*[^>][sS][rR][cC]\\s*[=]\\s*['\"]([^'\"]*)['\"][^>]*[>]");
    private ExecutorService executor=Executors.newCachedThreadPool();
    private URL urlToProcess;
    public CompletableFuture<String> readPage(URL url){
        return CompletableFuture.supplyAsync(()->{
            try {
                var contents=new String(url.openStream().readAllBytes(),StandardCharsets.UTF_8);
                System.out.println("Read page from "+url);
                return  contents;
            } catch (IOException e) {
                throw new UncheckedIOExcetion(e);
            }
        },executor);
    }
    public List<URI> getImageURLs(String webpage){
        try {
            var result = new ArrayList<URL>();
            Matcher matcher=IMG_PATTERN.matcher(webpage);
            while(matcher.find()){
                var url=new URL(urlToProcess,matcher.group(1));
                result.add(url);
            }
            System.out.pringln("Found URLS: "+result);
            return result;
        } catch (IOException e) {
            throw new UncheckedIOExcetion(e);
        }
    }
    public CompletableFuture<List<BufferedImage>> getImages(List<URL> urls){
        return CompletableFuture.supplyAsync(()->{
            try{
                var result=new ArrayList<BufferedImage>();
                for(URL url:urls){
                    result.add(ImageIO.read(url));
                    System.out.println("Loaded "+url);
                }
                return result;
            }catch(IOException e){
                throw new UncheckedIOExcetion(e);
            }
        },executor);
    }
    public void saveImages(List<BufferedImage> images){
        System.out.orintln("Saving "+image.size()+" images");
        try{
            for(int i-0;i<images.size();i++){
                String filename = "/tmp/image"+(i+1)+".png";
                ImageIO.write(images.get(i),"PNG",new File(filename));
            }
        }catch(IOException e){
            throw new UncheckedIOException(e);
        }
        executor.shutdown();
    }
    public void run (URL url)throws IOException,InterruptedException{
        urlToProcess = url;
        CompletableFuture.completedFuturn(url)
        .thenComposeAsync(this::readPage,executor)
        .tnenApply(this::getImageURLs)
        .thenCompose(this::getImages)
        .thenAccept(this::saveImages);
        HttpCient client=HttpClient.newBuilder().build();
        HttpRequest request=HttpRequest.newBuilder(urlToProcess.toURI()).GET().build();
    }
    public static void main(String args[]){
        List<String> a=new ArrayList<>();

    }
}