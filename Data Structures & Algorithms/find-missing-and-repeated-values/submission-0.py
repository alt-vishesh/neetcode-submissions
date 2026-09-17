class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        temp =[]
        for i in grid:
            temp.extend(i)

        temp1=[]
        repeated =0
        notin = 0
        for i in range(len(temp)):
            if temp[i] not in temp1:
                temp1.append(temp[i])
            else:
                repeated = temp[i]
        temp3 = [i for i in range(1,len(temp)+1)]
        print(temp3)
        temp2  = list(set(temp))
        print(temp2)
        for i in temp3:
            if i not in temp2:
                notin = i
        
        return [repeated,notin]



            

        