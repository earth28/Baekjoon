# 딕셔너리 사용
grade_credit = {'A+' : 4.5, 'A0' : 4.0, 'B+': 3.5, 'B0' : 3.0, 'C+' : 2.5, 'C0' : 2.0, 'D+' : 1.5, 'D0' : 1.0, 'F' : 0}
total = 0   # 학점 총합
result = 0  # (학점 * 성적) 총합

for i in range(20) :
    subject, credit, grade = input().split()
    
    if grade != 'P' :   # 등급이 P가 아닌 과목만 계산
        total += float(credit)
        result = result + float(credit) * grade_credit[grade]
        
print(format(result / total, ".6f"))