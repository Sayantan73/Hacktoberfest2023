
class STRING_COUNTER :
    
    def __init__(self) -> None:
        pass
    
    def count_characters(self, string) -> int:
        return len(string)
    
    def count_alphabets(self, string) -> int:
        return sum([1 for char in string if char.isalpha()])
    
    def count_digits(self, string) -> int:
        return sum([1 for char in string if char.isdigit()])
    
    def count_special_characters(self, string) -> int:
        return sum([1 for char in string if not char.isalnum()])
    
if __name__ == '__main__':
    
    string_counter = STRING_COUNTER()
    string = input("Enter the string : ")
    print("Total number of characters : ", string_counter.count_characters(string))
    print("Total number of alphabets : ", string_counter.count_alphabets(string))
    print("Total number of digits : ", string_counter.count_digits(string))
    print("Total number of special characters : ", string_counter.count_special_characters(string))
    print("Total number of words : ", len(string.split(" ")))