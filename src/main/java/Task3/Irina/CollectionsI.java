import org.apache.commons.collections4.SetUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String>collectionA = new ArrayList<>();
        ArrayList<String>collectionB = new ArrayList<>();
        collectionA.add("Irina");
        collectionA.add("Olga");
        collectionA.add("Nastya");
        collectionA.add("Artem");
        collectionB.add("Alexandra");
        collectionB.add("Anna");
        collectionB.add("Natalia");
        collectionB.add("Artem");
        collectionB.add("Olga");
        Collections collection = new Collections();
        System.out.println("DIY");
        System.out.println(collection.intersection(collectionA, collectionB));
        System.out.println(collection.symmetricDifference(collectionA, collectionB));
        System.out.println(collection.subtract(collectionA,collectionB));
        System.out.println(collection.union(collectionA,collectionB));
        //2
        System.out.println("With SetUtils");
        Set <String> collA = new HashSet<>(collectionA);
        Set<String> collB = new HashSet<>(collectionB);
        SetUtils.SetView<String> intersect = SetUtils.intersection(collA,collB);
        System.out.println(intersect);
        SetUtils.SetView<String> diff = SetUtils.union(SetUtils.difference(collA,collB),SetUtils.difference(collB,collA));
        System.out.println(diff);
        SetUtils.SetView<String> sub = SetUtils.difference(collA, collB);
        System.out.println(sub);
        SetUtils.SetView<String> union = SetUtils.union(collA, collB);
        System.out.println(union);


    }
    public ArrayList<String> intersection (ArrayList<String> collectionA, ArrayList<String> collectionB){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i<collectionA.size(); i++){
            for (int j = 0 ; j<collectionB.size(); j++){
                if (collectionA.get(i).equals(collectionB.get(j))){
                    result.add(collectionB.get(j));
                }
            }
        }
        return  result;
    }
    public ArrayList<String> symmetricDifference (ArrayList<String> collectionA, ArrayList<String> collectionB){
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        intersection = intersection(collectionA, collectionB);
        for(int i = 0; i<collectionA.size(); i++){
            if (!intersection.contains(collectionA.get(i))) result.add(collectionA.get(i));
            }
        for(int i = 0; i<collectionB.size(); i++){
            if (!intersection.contains(collectionB.get(i))) result.add(collectionB.get(i));
        }
        return result;
    }
    public ArrayList<String> subtract(ArrayList<String> collectionA, ArrayList<String> collectionB){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i<collectionA.size(); i++){
            if (!collectionB.contains(collectionA.get(i))) result.add(collectionA.get(i));
        }
        return result;
    }
    public ArrayList<String> union (ArrayList<String> collectionA, ArrayList<String> collectionB){
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> subtract = new ArrayList<>();
        subtract = subtract(collectionA, collectionB);
        for (int i = 0; i<collectionB.size(); i++){
            result.add(collectionB.get(i));
        }
        for (int i = 0; i<subtract.size(); i++){
            result.add(subtract.get(i));
        }
        return result;
    }

}
