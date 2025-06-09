read -p "enter a string:" str
str=$(echo "$str" | tr '[:lower:]' '[:upper:]')
rev=$(echo "$str" | rev)
if [ "$str" = "$rev" ]
then
        echo "palidrome"
else
        echo "not palidrome"
fi