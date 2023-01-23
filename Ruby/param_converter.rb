def param_converter(hash)
      hash.map { |i| i * "=" } * "&"
end
puts param_converter({:topic => "baseball", :team => "astros"})