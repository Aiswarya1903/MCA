read -p "enter a string:" str
l=${#str}
n=""
for i in $(seq $l -1 1)
do
        a=${str:i-1:1}
        n=$n$a
done
echo "reversed string is: $n"