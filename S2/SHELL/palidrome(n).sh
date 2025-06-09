read -p "enter a number:" n
num=$n
rev=0
while [ $n -gt 0 ]
do
    rem=$(($n % 10))
    rev=$((rev * 10 + $rem))
    n=$((n / 10))
done
if [ $num -eq $rev ]
then
    echo "palidrome"
else
    echo "not palidrome"
fi