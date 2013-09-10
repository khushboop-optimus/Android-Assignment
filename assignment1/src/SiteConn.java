import java.net.*;
import java.io.*;
/**
 * Gets the contents of an url as a stringBuffer.
  Usage example:
try {
  URL url=new URL("http://www.whatever.com/servlets/xyz?number=1000");
  SiteConn aConnection=new SiteConn(url);
  StringBuffer sb=aConnection.getContens();
  System.out.println(sb.toString());
} catch (MalFormedURLException mfe) {
  System.err.println(mfe.getMessage());
}

 *
 */

class SiteConn {
  URL url = null;
  public SiteConn(URL url) {
    this.url = url;
  }

  public StringBuffer getContents() throws Exception {
    StringBuffer buffer;
    String line;
    int responseCode;
    HttpURLConnection connection;
    InputStream input;
    BufferedReader dataInput;
    connection = (HttpURLConnection) url.openConnection();
    responseCode = connection.getResponseCode();
    if (responseCode != HttpURLConnection.HTTP_OK) {
      throw new Exception("HTTP response code: " +
                          String.valueOf(responseCode));
    }
    try {
      buffer = new StringBuffer();
      input = connection.getInputStream();
      dataInput = new BufferedReader(new InputStreamReader(input));
      while ( (line = dataInput.readLine()) != null) {
        buffer.append(line);
        buffer.append("\r\n");
      }
      input.close();
    }
    catch (Exception ex) {
      ex.printStackTrace(System.err);
      return null;
    }
    return buffer;
  }
}