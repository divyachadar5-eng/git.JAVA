// import java.util.HashSet;
// class hello{
//     public static void main(String[] args) {
//         int arr[]={1,2,4,3,2}
// ;        HashSet<Integer> set=new HashSet<>();
// for(int x: arr){
//     set.add(x);
// }
        
//         System.out.println(set);
//     }
// }


// import java.util.HashSet;
// class hello{
//     public static void main(String[] args) {
//         int arr[]={1,2,4,3,2}
// ;        HashSet<Integer> set=new HashSet<>();
// for(int x: arr){
//     set.add(x);
// }
// if(arr.length==set.size()){
//      System.out.println(true);
// }else{
//      System.out.println(false);
// }
        
//         System.out.println(set);
//     }
// }

// //common element print karna h
// import java.util.HashSet;
// class hello{
//     public static void main(String[] args) {
//         int arr1[]={1,2,4,5};
//         int arr2[]={1,2,4};
//         HashSet<Integer> set=new HashSet<>();
// for(int x: arr1){
//     set.add(x);
// }
// System.out.println(set);
//         HashSet<Integer> result=new HashSet<>();
//         for(int Y :arr2){
//             if(set.contains(Y));
//             result.add(Y);
//         }
//         System.out.println(result);
//     }
// }


// import java.util.LinkedHashSet;
// class hello{
//     public static void main(String[] args) {
        
//         LinkedHashSet<Integer> set=new LinkedHashSet<>();
//         set.add(7);
//         set.add(6);
//         set.add(8);
//         System.out.println(set);
//     }
// }

import java.util.TreeSet;
class hello{
    public static void main(String[] args) {
        
        TreeSet<Integer> set=new TreeSet<>();
        set.add(7);
        set.add(6);
        set.add(8);
        System.out.println(set);
    }
}