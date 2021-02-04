'''
买卖股票的最佳时机 II
'''
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        profix = 0
        for j in range(1, len(prices)):
            if prices[j] > prices[i]:
                profix += prices[j] - prices[i]
            i += 1
        return profix
