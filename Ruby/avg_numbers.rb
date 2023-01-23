def avg num
   num.inject(&:+) / num.length
end

puts avg [100,75,50]