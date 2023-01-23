def palindrome?(word)
	word.upcase == word.reverse.upcase
end
puts palindrome?("Tacocat") 