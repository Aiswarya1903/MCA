while true
do
        echo "enter the operation to perform:"
        echo "1.Addition(+)"
        echo "2.Subtraction(-)."
        echo "3.Multiplication(*)."
        echo "4.Division(/)."
        echo "5.exit"
        read -p "enter the numbers:" a b
        read -p "enter the symbol:" op

        if [[ $op == "5" ]]
        then
            echo "exiting"
            exit 0 #successfully exited without errors (exit 1=exited with errors)
        fi
        case $op in
                "+")
                        ans=$(echo "$a + $b" | bc);;
                "-")
                        ans=$(echo "$a - $b" | bc);;
                "*")
                        ans=$(echo "$a * $b" | bc);;
                "/")
                        ans=$(echo "scale=2; $a / $b" | bc);;
                *)
                        echo "enter valid option"
                        continue;;
        esac
        echo "$a $op $b = $ans"
done
