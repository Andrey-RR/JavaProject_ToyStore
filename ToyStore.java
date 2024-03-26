import java.util.PriorityQueue;

import java.io.FileWriter;
import java.io.IOException;

public class ToyStore {
    public static void main(String[] args) {

        String[] ids = {"toy1", "toy2", "toy3"};
        String[] names = {"Constructor", "Robot", "Doll"};
        int[] frequencies = {2, 2, 6};

        PriorityQueue<Toy> toysQueue = new PriorityQueue<>(new ToyComparator());


        for (int i = 0; i < ids.length; i++) {
            toysQueue.add(new Toy(ids[i], names[i], frequencies[i]));
        }

        writeFile(toysQueue);
    }

    static void writeFile(PriorityQueue<Toy> toysQueue) {


        try (FileWriter writer = new FileWriter("Results.txt")) {
            while (!toysQueue.isEmpty()) {
                Toy toy = toysQueue.poll();
                for (int i = 0; i < toy.getFrequency(); i++) {
                    writer.write(String.format("%s: %s\n", toy.getId(), toy.getName()));
                }
            }
        } catch (IOException e) {
            System.err.println("ошибка записи" + e.getMessage());
        }
    }
}