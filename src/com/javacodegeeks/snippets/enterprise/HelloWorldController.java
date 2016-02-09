package com.javacodegeeks.snippets.enterprise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin( allowedHeaders="*", origins="*", value="*", methods={RequestMethod.GET, RequestMethod.POST} )
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody Greeting greeting( @RequestParam(value="name", defaultValue="World") String name ) {
		System.out.println( "Greeting is called" );
        return new Greeting( counter.incrementAndGet(), "Hello " + name );
    }
	
	@RequestMapping(value = "/greeting/{msg}", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody Greeting greeting2( @PathVariable String msg ) {
		System.out.println( "Greeting2 is called" );
        return new Greeting( counter.incrementAndGet(), "Hello " + msg );
    }
	
	
	@RequestMapping(value = "/lottery", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody Object greeting3( ) {
//		System.out.println( "Greeting2 is called" );
//        return new Greeting( counter.incrementAndGet(), "Hello " + msg );
        
		
		try {
			
			// create HTTP Client
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
 
			// Create new getRequest with below mentioned URL
			HttpGet getRequest = new HttpGet("http://www.raffleresult.net/raffle_list_view?lotto_name=mahajana_sampatha");
 
			// Add additional header to getRequest which accepts application/xml data
			getRequest.addHeader("accept", "application/json");
 
			// Execute your request and catch response
			HttpResponse response = httpClient.execute(getRequest);
 
			// Check for HTTP response code: 200 = success
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
 
			// Get-Capture Complete application/xml body response
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			String output;
			System.out.println("============Output:============");
 
			
			String result = "";
			// Simply iterate through XML response and show on console.
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				result += output;
			}
			return result;
 
//		} catch( URISyntaxException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
        return null;
        
//        try {
//          // specify the host, protocol, and port
//          HttpHos target = new HttpHost("localhost", 8080, "http");
//
//          // specify the get request
//          HttpGet getRequest = new HttpGet("/springexample/helloWorld/greeting");
//          getRequest.addHeader("accept", "application/json");
//          System.out.println("executing request to " + target);
//      
//          HttpResponse httpResponse = httpclient.execute(target, getRequest);
//          HttpEntity entity = httpResponse.getEntity();
//      
//          System.out.println("----------------------------------------");
//          System.out.println(httpResponse.getStatusLine());
//          Header[] headers = httpResponse.getAllHeaders();
//          for (int i = 0; i < headers.length; i++) {
//          System.out.println(headers[i]);
//             }
//             System.out.println("----------------------------------------");
//      
//             if (entity != null) {
//          System.out.println(EntityUtils.toString(entity));
//             }
//      
//          } catch (Exception e) {
//             e.printStackTrace();
//          } finally {
//             // When HttpClient instance is no longer needed,
//             // shut down the connection manager to ensure
//             // immediate deallocation of all system resources
//             httpclient.getConnectionManager().shutdown();
//          }
    }
	
}
