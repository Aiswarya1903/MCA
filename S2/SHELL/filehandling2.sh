cat > myfile.txt
echo "1001  Ram   97"
echo "1002  neha  89"
echo "1010  divya 77"
echo "1025  rahul 65"
echo "1012  arun  99"
echo "1013  nisha 76"

echo "first 2 rows:"
head -2 myfile

echo "last two rows:"
tail -2 myfile

cp myfile mycopyfile

echo "number of line: $(wc -l < myfile)"
echo "number of words:$(wc -w < myfile)"
echo "number of characters:$(wc -c < myfile)"

echo "3rd row "
sed  -n '3p' myfile

cat myfile >> myappendfile