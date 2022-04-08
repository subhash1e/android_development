@ComparisionSort
@StableSort

fun main(){
  val arr = [3,4,2,1];
  for( i in 1 until arr.size){
    for(j in i downTo 1){
      if(arr[j-1] < arr[j])break
      else arr.exch(j,j-1)
      // we are simply transversing to each index and putting it to its right pos 
      // in already left sorted array
      // start from [3] sorted [4,2,1] unsorted
      // then put 4 in right place by comparing [3,4] [2,1]
      // then [2,3,4] [1]
      // then [1,2,3,4]
      
  }
}
