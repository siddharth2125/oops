#!/bin/bash
read -p "Enter number: " number
read -p "Enter power: " power
result=1
i=0
while (( i < power )); do
  result=$((result * number))
  ((i++))
done
echo "$number^$power = $result"
