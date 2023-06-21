import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConstrutores {
    public static void main(String[] args) {
        // Construtor vazio - Ordem natural das chaves
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Chave2", 20);
        treeMap1.put("Chave1", 10);
        System.out.println("TreeMap 1: " + treeMap1);

        // Construtor com comparador - Ordem reversa das chaves
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
        treeMap2.put("Chave4", 40);
        treeMap2.put("Chave3", 30);
        System.out.println("TreeMap 2: " + treeMap2);

        // Construtor com base em outro mapa - Ordem natural das chaves
        Map<String, Integer> map = new TreeMap<>();
        map.put("Chave6", 60);
        map.put("Chave5", 50);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>(map);
        System.out.println("TreeMap 3: " + treeMap3);
    }
}
