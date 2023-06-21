import java.util.HashMap;
import java.util.Map;

public class HashMapConstrutores {
    public static void main(String[] args) {
        // Construtor vazio
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Chave1", 10);
        hashMap1.put("Chave2", 20);
        System.out.println("HashMap 1: " + hashMap1);

        // Construtor com capacidade inicial
        Map<String, Integer> hashMap2 = new HashMap<>(5);
        hashMap2.put("Chave3", 30);
        hashMap2.put("Chave4", 40);
        System.out.println("HashMap 2: " + hashMap2);

        // Construtor com capacidade inicial e fator de carga
        Map<String, Integer> hashMap3 = new HashMap<>(10, 0.5f);
        hashMap3.put("Chave5", 50);
        hashMap3.put("Chave6", 60);
        System.out.println("HashMap 3: " + hashMap3);

        // Construtor com base em outro mapa
        Map<String, Integer> hashMap4 = new HashMap<>(hashMap1);
        System.out.println("HashMap 4: " + hashMap4);
    }
}