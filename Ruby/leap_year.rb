require 'Date'
years= (1900..1999).to_a
def leapyears(years)
	leap_years=[]
	years.each do |year|
		current_year=Date.new(year)
		leap_years<< year if current_year.leap?
	end 
	leap_years
end
puts  leapyears(years)
	