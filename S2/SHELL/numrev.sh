read -p "enter a number:" n
no=$n
rev=0
while [ $n -gt 0 ]
do
        rem=$((n % 10))
        rev=$((rev * 10 + $rem))
        n=$((n / 10))
done
echo "reversed number is $rev"