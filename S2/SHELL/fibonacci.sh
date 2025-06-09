read -p "enter a number:" n
a=0
b=1
for i in $(seq 1 $n)
do
        c=$((a + b))
        echo -n " $a"
        a=$b
        b=$c
done
echo