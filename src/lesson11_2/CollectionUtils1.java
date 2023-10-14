package lesson11_2;

import java.util.*;

public class CollectionUtils1 implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> resultIntersection = new ArrayList<>();
        resultIntersection.addAll(a);
        resultIntersection.retainAll(b);
        return resultIntersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> resultUnionWithoutDuplicate = new HashSet<>();
        resultUnionWithoutDuplicate.addAll(a);
        resultUnionWithoutDuplicate.addAll(b);
        return resultUnionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> resultIntersectionWithoutDuplicate = new HashSet<>();
        resultIntersectionWithoutDuplicate.addAll(a);
        resultIntersectionWithoutDuplicate.retainAll(b);
        return resultIntersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> resultDifference;
        resultDifference = union(a, b);
        resultDifference.removeAll(intersection(a, b));
        return resultDifference;
    }
//    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
//        LinkedList<Integer> dfference = new LinkedList<>();
//        for(Integer num:0)
//        if (b.contains(num)){
//        result.add(num)};

}
