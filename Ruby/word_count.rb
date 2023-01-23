def total_word_count(s)
      s.scan(/\w+/).count	
end
def each_word_count(s)
     word=Hash.new(0) 
     s.downcase.scan(/\w+/) { |w| word[w] += 1 }
     word	
end
puts total_word_count('I am harshali - * also am a girl')
puts each_word_count('I am harshali - * also am a girl') 

