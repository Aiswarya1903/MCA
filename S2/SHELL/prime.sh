read -p "enter a number:" n
count=0
for i in $(seq 2 $n)
do
        if [ $((n % i)) -eq 0 ]
        then
                count=$((count + 1))
        fi
done
if [ $count -eq 1 ]
then
        echo "prime"
else
        echo "not prime"
fi