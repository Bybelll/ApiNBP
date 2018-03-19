package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class JsonDownloader {

	public static String getJsonAsString() {
		InputStream inputstrem = null;
		BufferedReader bufferedReader = null;
		StringBuilder strBuilder = new StringBuilder();

		try {
			inputstrem = new URL(UrlCreator.createUrlString()).openStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputstrem, Charset.forName("UTF-8")));

			String cp;
			while ((cp = bufferedReader.readLine()) != null) {
				strBuilder.append(cp);
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (inputstrem != null)
					inputstrem.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return strBuilder.toString();
	}
}