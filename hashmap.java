import java.util.HashMap;

// import java.util.HashMap;
// class Main{
//     public static void main(String[] args) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int arr[]={1,1,3,4,5,5,6};
//         for(int x: arr){
//             map.put(x,map.getOrDefault(x,0)+1);
//         }
//         System.out.println(map);
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int arr[]={2,7,11,15};
//         int target=9;
//         for (int i = 0; i < arr.length; i++) {
//             int diff=target-arr[i];
//             if(map.containsKey(diff) ){
//             System.out.println(map.get(diff)+" "+i);
//             break;
//         }
//         map.put(arr[i],i);
//     }
// }
// }


class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={2,7,11,15};
        int target=22;
        for (int i = 0; i < arr.length; i++) {
            int diff=target-arr[i];
            if(map.containsKey(diff) );
            System.out.println(map.get(diff)+" "+i);
            break;
        }
        map.put(arr[i],i);
    }
}