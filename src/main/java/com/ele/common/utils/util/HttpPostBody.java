package com.ele.common.utils.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * request body include transfer data and post method provided https
 * 
 * @author yaoxj
 * @time 2017年6月20日上午11:48:50
 */
public class HttpPostBody {
	/**
	 * content type
	 */
	private static final String APPLICATION_JSON = "application/json";
	private static final String APPLICATION_PLAIN = "text/plain";
	private static final String APPLICATION_XML = "application/xml";
	private static final String APPLICATION_HTML = "text/html";
	/**
	 * content encode
	 */
	private static final String CONTENT_ENCODE = "UTF-8";
	
	/**
	 * put json in request body by post method
	 * @param url  request url
	 * @param param body data
	 * @return
	 */
	public static final String postJson(String url, String param) {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);

		StringEntity entity = new StringEntity(param, CONTENT_ENCODE);// 解决中文乱码问题
		entity.setContentEncoding(CONTENT_ENCODE);
		entity.setContentType(APPLICATION_JSON);
		httpPost.setEntity(entity);

		try {
			CloseableHttpResponse response = httpclient.execute(httpPost);
			String respContent = "";
			if (response.getStatusLine().getStatusCode() == 200) {
				HttpEntity he = response.getEntity();
				respContent = EntityUtils.toString(he, CONTENT_ENCODE);
				return respContent;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}
	
	/**
	 * put  text in request body by post method
	 * @param url
	 * @param param
	 * @return
	 */
	public static final String postText(String url, String param) {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);

		StringEntity entity = new StringEntity(param, CONTENT_ENCODE);// 解决中文乱码问题
		entity.setContentEncoding(CONTENT_ENCODE);
		entity.setContentType(APPLICATION_PLAIN);
		httpPost.setEntity(entity);

		try {
			CloseableHttpResponse response = httpclient.execute(httpPost);
			String respContent = "";
			if (response.getStatusLine().getStatusCode() == 200) {
				HttpEntity he = response.getEntity();
				respContent = EntityUtils.toString(he, CONTENT_ENCODE);
				return respContent;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	/**
	 * post method transfer data in key value  ,you can use https protocal
	 * @param url , request url 
	 * @param map ,  key value data
	 * @param charset , if null, UTF-8
	 * @return
	 */
	@SuppressWarnings("resource")
	public String doPost(String url,Map<String,String> map,String charset){
        HttpClient httpClient = null;  
        HttpPost httpPost = null;  
        String result = null;  
        if(null == charset|| "".equals(charset)){
        	charset = CONTENT_ENCODE;
        }
        try{  
            httpClient = new SSLClient();  
            httpPost = new HttpPost(url);  
            //设置参数  
            List<NameValuePair> list = new ArrayList<NameValuePair>();  
            Iterator iterator = map.entrySet().iterator();  
            while(iterator.hasNext()){  
                Entry<String,String> elem = (Entry<String, String>) iterator.next();  
                list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));  
            }  
            if(list.size() > 0){  
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);  
                httpPost.setEntity(entity);  
            }  
            HttpResponse response = httpClient.execute(httpPost);  
            if(response != null){  
                HttpEntity resEntity = response.getEntity();  
                if(resEntity != null){  
                    result = EntityUtils.toString(resEntity,charset);  
                }  
            }  
        }catch(Exception ex){  
            ex.printStackTrace();  
        }  
        return result;  
    }  
	
	
	
}
