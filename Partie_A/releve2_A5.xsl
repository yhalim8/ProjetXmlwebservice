<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>releve</title>
            </head>
            <style>
                h1{color:red}
                h3{color:blue}
                
            </style>
            <body>
                <h1>releve bancaire</h1>
                <xsl:for-each select="releve">
                    <h3> RIB : <xsl:value-of select="@RIB"></xsl:value-of></h3> 
                    <h3>dateReleve : <xsl:value-of select="dateReleve"></xsl:value-of></h3>
                    <h3>Solde : <xsl:value-of select="solde"></xsl:value-of></h3>
                    
                    <h4>les operations effectuee de <xsl:value-of select="operations/@dateDebut" ></xsl:value-of> vers <xsl:value-of select="operations/@dateFin" ></xsl:value-of></h4>
                    <table border="1" width="75%">
                        <tr>
                                   <th>type</th><th>date</th><th>montant</th><th>description</th>
                        </tr>
                        <xsl:for-each select="operations/operation[@type='CREDIT']">
                        <tr>
                          <td><xsl:value-of select="@type" ></xsl:value-of></td>
                            <td><xsl:value-of select="@date"></xsl:value-of></td>
                            <td><xsl:value-of select="@montant"></xsl:value-of></td>
                            <xsl:value-of select="@description"></xsl:value-of>
                        </tr></xsl:for-each>
                    </table>
                    
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>