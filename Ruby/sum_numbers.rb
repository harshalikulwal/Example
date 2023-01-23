def sum_numbers num
    1.upto(num).inject(&:+)
end
puts sum_numbers 100

# n*(n-1)/2
# arr.each{|i| sum+= i }
 