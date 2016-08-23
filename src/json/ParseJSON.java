package json;

import java.io.IOException;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ParseJSON {

	public static void main(String[] args) {
		int id = 2;

		for (String booking : getDATA(id)) {
			System.out.println(booking);
		}
	}

	private static String[] getDATA(int id) {

		String json = null;

		Booking booking = null;

		try {
			json = getJSON("http://localhost:8080/bookings/" + id);
			Gson gson = new Gson();
			booking = gson.fromJson(json, Booking.class);
		} catch (Exception e) {

		}

		return new String[] { "Id: " + booking.getId(), "Name: " + booking.getBookingName() };
	}

	static OkHttpClient client = new OkHttpClient();

	private static String getJSON(String url) throws IOException {

		Request request = new Request.Builder().url(url).build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}

}
