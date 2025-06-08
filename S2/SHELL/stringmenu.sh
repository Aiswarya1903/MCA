read -p "enter a string:" str
while true
do
        echo "enter the operation to perform"
        echo "1.find length"
        echo "2.reverse"
        echo "3.to upper"
        echo "4.to lower"
        echo "5.exit"
        read -p "enter the operation to perform" op
        case $op in
                1)
                        echo "length of the string:${#str}";;
                2)
                        rev=$(echo "$str" | rev)
                        echo "reversed string is : $rev";;
                3)
                        echo "$str" | tr "a-z" "A-Z";;
                        #echo $"{str^^}"
                4)
                        echo "$str" | tr "A-Z" "a-z";;
                        #echo $"{str,,}"
                5)
                        echo "exiting"
                        break;;
                *)
                        echo "enter valid option"
                        continue;;
        esac
done