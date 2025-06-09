read -p "enter a string:" str
vowel=$(echo "$str" | grep -o -i "[AEIOU]" | wc -l)
cons=$(echo "$str" | grep -o -i "[BCDFGHJKLMNPQRSTVWXYZ]" | wc -l)
echo "nuumber of vowels:$vowel"
echo "number of consonants:$cons"