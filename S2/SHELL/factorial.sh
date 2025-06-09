read -p "enter a number:" n
fact=1
for i in $(seq 1 $n)
do
    fact=$((fact * i))
done
echo "factorial is :$fact"