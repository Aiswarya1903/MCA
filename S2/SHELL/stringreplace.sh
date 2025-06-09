read -p "enter a string:" str
read -p "enter the word:" old
read -p "enter the word  to replace:" new
res=""
for word in $str
do
        if [ "$word" = "$old" ]
        then
                res="$res $new"
        else
                res="$res $word"
        fi
done
echo "$res"
