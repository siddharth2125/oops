#!/bin/bash
read -p "Enter a number: " number
for ((i=6; i<=9; i++)); do
  echo "$number * $i = $((number * i))"
done
