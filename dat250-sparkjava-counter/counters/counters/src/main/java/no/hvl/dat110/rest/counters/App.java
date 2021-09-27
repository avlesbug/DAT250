package no.hvl.dat110.rest.counters;

import static spark.Spark.after;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.put;
import static spark.Spark.post;
import static spark.Spark.delete;


import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {

	static HashMap<Integer, Todo> todoMap = new HashMap<>();

	public static void main(String[] args) {

		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}

		todoMap.put(0, new Todo("This is the summary", "This is the description"));

		after((req, res) -> {
			res.type("application/json");
		});

		get("/hello", (req, res) -> "Hello World!");

		get("/todos", (req, res) -> {
			Gson gson = new Gson();
			return gson.toJson(todoMap);
				}
		);

		get("/todos/:id", (req, res) -> {
			Gson gson = new Gson();
			int id = Integer.parseInt(req.params("id"));

			return todoMap.get(id).toJson();
				}
		);

		put("/todos/:id", (req, res) -> {

			Gson gson = new Gson();

			int id = Integer.parseInt(req.params("id"));

			todoMap.put(id, gson.fromJson(req.body(), Todo.class));

			return todoMap.get(id).toJson();

		});


		post("/todos", (req, res) -> {
			Gson gson = new Gson();

			int id = todoMap.size();

			todoMap.put(id, gson.fromJson(req.body(), Todo.class));

			return todoMap.get(id).toJson();

		});

		delete("/todos/:id", (req, res) -> {
			Gson gson = new Gson();

			int id = Integer.parseInt(req.params("id"));

			todoMap.remove(id);

			return gson.toJson(todoMap);

		});

		delete("/todos", (req, res) -> {
			Gson gson = new Gson();
			todoMap = new HashMap<>();
			return gson.toJson(todoMap);

		});

	}
}
