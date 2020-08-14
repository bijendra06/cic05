SEQUENCES:
1.#!/bin/bash -x
x=$(( RANDOM % 10))
echo $x
2.#!/bin/bash -x
x=$(( RANDOM % 6 + 1))
echo $x
3.#!/bin/bash -x
dice1=$(( RANDOM % 6 + 1))
echo$dice1
dice2=$(( RANDOM % 6 + 1))
echo$dice2
sum=$(( $dice1 + $dice2))
Echo”sum of two random dice:$sum”
4.#!/bin/bash -x
echo”enter number(N)”
read N
sum=0
for((i=1;i<N;i++))
do
num=$((( RANDOM % 89) + 10))
echo$num
sum=$(( sum +num))
done
echo”sum of 5 random numbers:$sum”
avg=$(($sum/$N))
echo”average of the 5 random numbers:$avg”
5.#!/bin/bash-x
echo “1ft=12 inch then 42inch=”$((42/12))
echo “area of rectangular plot 60 feet*40 feet in meter”
area=$((60*40))
echo $area
areameter=$((($area)/3))
echo$areameter
echo”area of such 24 plot in meter”
areameter=$((($areameter)*24))
acre=$((($areameter)/4047))
Echo “area in acre of 24 plot”$acre
6.#!/bin/bash -x
num1=$(((RANDOM %899) + 100))
echo $num1
num2=$(((RANDOM %899)+ 100))
echo $num2
num3=$(((RANDOM %899)+ 100))
echo $num3
num4=$(((RANDOM %899)+ 100))
echo $num4
num5=$(((RANDOM %899)+ 100))
echo $num5
echo “find max value”
If[[ $num1 -gt $num2 && $num1 -gt $num3 && $num1
-gt $num4 && $num1 -gt $num5]]
then
echo “$num1 is max value”
elif[[$num2 -gt $num1 && $num2 -gt $num3 && $num2 -gt
$num4&&$num2 -gt $num5]]
Then
echo”$num2 is max value”
elif[[$num3 -gt $num1 && $num3 -gt $num2 && $num3 -gt
$num4&&$num3-gt $num5]]
Then
echo”$num3 is max value”
elif[[$num4 -gt $num1 && $num4 -gt $num2 && $num4 -gt
$num4&&$num4-gt $num5]]
Then
echo”$num4 is max value”
else
echo “$num5 is max value”
fi
echo”find min value”
if[[$num1 -lt $num2&& $num1 -lt $num3 && $num1 -lt $num4&&
$num1 -lt $num5]]
Then
echo “$num1 is min value”
elif[[$num2 -lt $num1 && $num2 -lt $num3&& $num2 -lt $num4&&
$num2 - lt $num5]]
Then
echo “$num2 is min value”
elif[[$num3 -lt $num1 && $num3 -lt $num2&& $num3 -lt $num4&&
$num3 - lt $num5]]
echo “$num3 is min value”
elif[[$num4 -lt $num1 && $num4 -lt $num2&& $num4 lt $num3&&
$num4 - lt $num5]]
Then
echo “$num4 is min value”
else
echo “$num5 is min value”
fi
7.#!/bin/bash -x
Read -p “enter month [1-12] ”month
Read -p” enter date[1-31]”date
if[$month -ge 3]&&[$date -ge 20]
Then
echo “true”
elif[$month -le 6]&&[$date -le 20]
Then
echo “true”
else
echo” false”
fi
8.
#!/bin/bash -x
echo”leap year”
read -p”enter any year”year
echo $year
if[$((year %400)) -eq 0]
then
echo”$year is leap year”
elif[$((year %100)) -eq 0]
then
echo”$year is leap year”
elif[$((year %4)) -eq 0]
then
echo”$year is leap year”
else
echo”year is not leap year ”
fi
9.#!/bin/bash -x
heads=0;
tails=1;
flip=$((RANDOM %2))
echo $flip
if[$head -eq $flip]
then
echo”heads”
else” tails”
fi
10.#!/bin/bash -x
read -p ” enter any number in range 0 to 9:”num
if[$num-eq 0]
then
echo”zero”
elif[$num-eq 1]
then
echo”one”
elif[$num-eq 2]
then
echo”two”
elif[$num-eq 3]
then
echo”three”
elif[$num-eq 4]
then
echo”four”
elif[$num-eq 5]
then
echo”five”
elif[$num-eq 6]
then
echo”six”
elif[$num-eq 7]
then
echo”seven”
elif[$num-eq 8]
then
echo”eight”
else
echo”nine”
fi
11.#!/bin/bash -xelif[$weekday -eq 2]
Then
echo”monday”
read - p”enter the num ”:”weekday
if[$weekday -eq 1]
Then
echo”sunday”
elif[$weekday -eq 2]
Then
echo”monday”
elif[$weekday -eq 3]
Then
echo”tuesday ”
elif[$weekday -eq 4]
Then
echo”wednesday”
elif[$weekday -eq 5]
Then
echo”thursday”
elif[$weekday -eq 6]
Then
echo”friday”
elif[$weekday -eq 7]elif[$num -eq 10]
then
echo”ten”
Then
echo”saturday”
fi
12.
#!/bin/bash -x
read -p”enter any number like(1,10,100,1000):”num
if[$num -eq 1]
then
echo”unit”
elif[$num -eq 10]
then
echo”ten”
elif[$num -eq 1000]
then
echo”thousand”
else
echo”wrong input”
fi
13.
#!/bin/bash-x
read-p “enter value of a:”a
read-p “enter value of b:”b
read-p “enter value of c:”c
exp1=$((a+b*c))
echo”exp1::$exp1”
exp2=$((c+a/b))
echo”exp2::$exp2”
exp3=$((a%b+c))
echo”exp3::$exp3”
exp4=$((a*b+c))
echo”exp4::$exp4”
#max value
if[[$exp1 -gt $exp2 && $exp1 -gt $exp2&& $exp1 -gt $exp4]]
then
echo “exp1 is max ”
elif[[$exp2 -gt $exp3 && $exp2 -gt $exp3&& $exp2 -gt $exp4]]
then
echo “exp2 is max ”
elif[[$exp3 -gt $exp1 && $exp3 -gt $exp2&& $exp3 -gt $exp4]]
then
echo “exp3 is max ”
else
echo” exp4 is max”
fi
#min value
if[[$exp1 -gt $exp2 && $exp1 -gt $exp2&& $exp1 -gt $exp4]]
then
echo “exp1 is min ”
elif[[$exp2 -gt $exp3 && $exp2 -gt $exp3&& $exp2 -gt $exp4]]
then
echo “exp2 is min ”
elif[[$exp3 -gt $exp1 && $exp3 -gt $exp2&& $exp3 -gt $exp4]]
then
echo “exp3 is min ”
else
echo” exp4 is min”
fi
14.
#!/bin/bash-x
read -p “enter any number in range 0 to 9:”number
case$number in
echo”zero”;;
echo”one”;;
echo” two”;;
echo”three”;;
echo”four”;;
echo”five”;;
echo” six”;;
echo”seven”;;
echo”eight”;;
echo”nine”;;
echo”wrong input ”;;
esac
15.
#!/bin/bash -x
Read -p “enter number:”n
case$n in
echo” sunday”
;;
echo”monday”
;;
echo”tuesday”
;;
echo”wednesday”
;;
echo”thursday”
;;
echo”friday”
;;
echo”saturday”
;;
echo”enter value between 1 to 7”
;;
esac
16.
#!/bin/bash-x
read -p “enter any number like[1,10,100,1000]” number
case$number in
echo “unit”
;;
echo”ten”
;;
echo”hundred”
;;
echo”other”
;;
esac
17.
#!/bin/bash -x
echo” unit conversion”
echo”1:feet to inch”
echo”2:inch to feet”
echo”3:feet to meter”
echo”4:meter to feet”
read -p “enter any number 1 to 4:”num
Case $num in
read -p “unit conversion enter any value”val
feet=$(($val*12))
echo “$val feet to:$inch feet inch”
;;
read -p “unit conversion enter any value”val
inch=$(($val/12))
echo “$val inch to:$inch feet”
;;
read -p “unit conversion enter any value”val
feet=$(($val/3.281))
echo “$val feet to: $feet meter”
;;
read -p “unit conversion enter any value”val
meter=$(($val*3.281))
echo “$val meter to:$meter feet”
;;
echo” wrong input”
;;
esac