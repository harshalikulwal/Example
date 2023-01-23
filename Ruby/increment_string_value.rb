def increment_value(str)
 str+str.next.slice(-1)	
end
puts increment_value('12345')
