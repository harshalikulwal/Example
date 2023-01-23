def rev str
rev=""
i = str.length-1
while i>=0
    rev << str[i]
    i -=1
end
rev 
end
puts rev 'harshali'
# len=str.length-1
#len.downto(0).each { |i| rev << str[i]}