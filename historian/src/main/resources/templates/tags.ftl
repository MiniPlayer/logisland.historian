<#import "/spring.ftl" as spring>

    <html>
    <h1>${principal.getName()} tags</h1>
    <ul>
        <#list tags as tag>
            <li>${tag.getItemName()}</li>
        </#list>
    </ul>
    <p>
        <a href="/logout">Logout</a>
    </p>
    </html>