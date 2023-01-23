def bubble_sort(arr)
n=arr.length
loop do
      swapped =false
      (n-1).times do |i|
            if(arr[i]>arr[i+1])
                  arr[i],arr[i+1]=arr[i+1],arr[i]
                  swapped=true
           end
      end
break if not swapped 
end
arr
end
puts bubble_sort([2,53,1,79,31,4])