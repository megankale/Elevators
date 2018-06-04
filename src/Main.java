/**
 *
 * @author megankale & nicoleBoodhai
 */
import java.io.*;
public class Main {
	public static void main(String[] args) {
		System.out.format("Elevator simulation started for %d people%n",Constants.NUMBER_OF_PEOPLE);
		long startMilliseconds = System.currentTimeMillis();

		Statistic.Initialize();
		System.out.println("Statistic initialized");

		System.out.println("Algorithm started");

			Algorithm algorithm = new Algorithm(Constants.NUMBER_OF_FLOORS,
												Constants.NUMBER_OF_ELEVATORS,
												Constants.NUMBER_OF_PEOPLE);
			algorithm.Run();
		
		System.out.println("Algorithm finished");

		Statistic.Calculate();
		System.out.println("Statistic calculated");

		long endMilliseconds = System.currentTimeMillis();
		long simulationMilliseconds = endMilliseconds - startMilliseconds;
		System.out.format("Elevator simulation finished in %d milliseconds%n", simulationMilliseconds);
		System.out.println("_________________________________________________");
		System.out.println("Results:");
		System.out.print(Statistic.GetOutput());
		try {
				PrintWriter output = new PrintWriter(new FileWriter("output.txt"));
				output.print(Statistic.GetOutput());
				output.close();
			}
			catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}