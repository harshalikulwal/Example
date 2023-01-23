def hash_fizz_buzz n
hash=Hash.new
1.upto(n).each do |num|
     if num%3==0 && num%5==0
         hash[num]="FizzBuzz"
     elsif num%3==0
         hash[num]="Fizz"	
     elsif num%5==0
         hash[num]="Buzz"
     else	
         hash[num]=num 	
     end	
end
hash
end
puts hash_fizz_buzz 15
