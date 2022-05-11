

#Password random

from ntpath import join
import random


lower_case = "qwertyuiopasdfghjklzxcvbnm"
upper_case="QƯERTYUIOPASDFGHJKLZXCVBNM"
number = "1234567890"
sysbols = "!@#$%^&*((>?|+"

all = lower_case+upper_case+number+sysbols
length_for_pass = 8
pass_of_you = "".join(random.sample(all,length_for_pass))

print("pass_of_you:"+pass_of_you)