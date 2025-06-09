read -p "enter the number:" n
num=$n
while [ $n -gt 0 ]
do
        l=$((n % 10))
        sum=$((sum + l))
        n=$((n / 10))
done
echo "sum is :$sum"
