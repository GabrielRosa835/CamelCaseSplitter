public class Splitter
{
    public static string[] Split(string text)
    {
        List<int> splitPoints = new List<int>();
        for (int i = 0; i < text.Length; i++)
        {
            if (Splitter.IsSplitPoint(i, text))
            {
                splitPoints.Add(i);
            }
        }

        return SplitText(text, splitPoints);
    }
    private static string[] SplitText(string text, List<int> splitPoints)
    {
        List<string> splitstrings = new List<string>();

        if (splitPoints.Count != 0)
        {
            splitstrings.Add(text.Substring(0, splitPoints.First() + 1));
            for (int i = 0; i < splitPoints.Count - 1; i++)
            {
                int substringLength = splitPoints[i + 1] - splitPoints[i];
                splitstrings.Add(text.Substring(splitPoints[i] + 1, substringLength));
            }
            int lastSplitPoint = splitPoints.Last();
            int lastSubstringLength = text.Length - lastSplitPoint - 1;
            splitstrings.Add(text.Substring(lastSplitPoint + 1, lastSubstringLength));
        }
        else
        {
            splitstrings.Add(text);
        }

        return splitstrings.ToArray();
    }
    private static bool IsSplitPoint(int index, string text)
    {
        char[] chars = text.ToCharArray();

        return IsLastLowerCase(index, chars)
            || IsLastUpperCase(index, chars)
            || IsLastDigit(index, chars);
    }

    private static bool IsLastLowerCase(int index, char[] chars)
    {
        return index < chars.Length - 1
            && Char.IsLower(chars[index])
            && (Char.IsUpper(chars[index + 1]) || Char.IsDigit(chars[index + 1]));
    }
    private static bool IsLastDigit(int index, char[] chars)
    {
        return index < chars.Length - 1 
            && Char.IsDigit(chars[index]) 
            && Char.IsLetter(chars[index + 1]);
    }
    private static bool IsLastUpperCase(int index, char[] chars)
    {
        return index < chars.Length - 2 
            && Char.IsUpper(chars[index]) 
            && (Char.IsUpper(chars[index + 1]) || Char.IsDigit(chars[index + 1]))
            && (Char.IsLower(chars[index + 2]) || Char.IsDigit(chars[index + 1]));
    }
}