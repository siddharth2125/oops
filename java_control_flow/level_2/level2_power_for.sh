#!/bin/bash
read -p "Enter number: " number
read -p "Enter power: " power
result=1
for ((i=1; i<=power; i++)); do
  result=$((result * number))
done
echo "$number^$power = $result"
