fun main(){
  var arr = arrayOf(2,4,1,3,1);
  for( i in arr.indices){
    var min = i;
    for(j in i+1 until arr.size){
      if(arr[min]>arr[j])min=j;
// in this what is happening is that
// we select min on the right unsorted array 
// and swap it in right of sorted array , select and swap
// [2,4,1,3,1] -> [1] [4,2,3,1]
// [1,1] [2,3,4]
//.........
// [1,1,2,3,4]
    }


    if(i!=min)
    arr[i] = arr[min].also{arr[min] = arr[i]}
  }
  for( x in arr)print("$x ")
}
