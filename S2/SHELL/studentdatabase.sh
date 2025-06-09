read -p "enter the name of database:" db
while true
do
        echo "1. view database"
        echo "2. view specific record"
        echo "3. Add record"
        echo "4. delete record"
        echo "5.exit"
        read -p "enter your choice:" op
        case $op in
                1)cat $db;;
                2)read -p "enter ID:" id
                  grep -i "$id" $db;;
                3)read -p "enter ID:" id
                  read -p "enter student name:" nm
                  read -p "enter des:" des
                  read -p "enter college name:" clg
                  echo "$id $nm $des $clg" >> $db;;
                4)read -p "enter the id:" id
                  grep -v "$id" "$db" > temp.txt
                  mv temp.txt $db
                  echo "data deleeted"
                  cat $db;;
                5)echo "exiting"
                  break;;
                *)echo "enter valid option:"
                  continue;;
        esac
done